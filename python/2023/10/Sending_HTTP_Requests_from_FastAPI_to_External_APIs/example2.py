from fastapi import FastAPI
import requests

app = FastAPI()

@app.get("/external-api")
def get_external_api_data():
    response = requests.get("https://api.example.com/data")
    return response.json()
