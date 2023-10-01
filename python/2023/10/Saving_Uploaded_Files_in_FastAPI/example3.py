@app.post("/upload")
async def upload_file(file: UploadFile = File(...)):
    # Save the uploaded file
    with open(file.filename, "wb") as buffer:
        buffer.write(await file.read())
    return {"filename": file.filename}
