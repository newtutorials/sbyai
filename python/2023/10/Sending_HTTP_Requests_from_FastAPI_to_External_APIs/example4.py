from fastapi import FastAPI
import requests

app = FastAPI()

@app.post("/external-api")
def post_external_api_data(data: dict):
    response = requests.post("https://api.example.com/data", json=data)
    return response.json()
