from fastapi import FastAPI
import requests

app = FastAPI()

@app.get("/external-api")
def get_external_api_data(query_param: str):
    params = {"param": query_param}
    response = requests.get("https://api.example.com/data", params=params)
    return response.json()
