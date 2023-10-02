from fastapi import FastAPI
import requests

app = FastAPI()

@app.get("/external-api")
def get_external_api_data():
    try:
        response = requests.get("https://api.example.com/data")
        response.raise_for_status()
        return response.json()
    except requests.exceptions.HTTPError as errh:
        return f"HTTP Error: {errh}"
    except requests.exceptions.ConnectionError as errc:
        return f"Error Connecting: {errc}"
    except requests.exceptions.Timeout as errt:
        return f"Timeout Error: {errt}"
    except requests.exceptions.RequestException as err:
        return f"Unknown Error: {err}"
