from fastapi import FastAPI
import requests

app = FastAPI()

@app.get("/external-api")
def get_external_api_data():
    headers = {"Authorization": "Bearer token123"}
    response = requests.get("https://api.example.com/data", headers=headers)
    return response.json()
