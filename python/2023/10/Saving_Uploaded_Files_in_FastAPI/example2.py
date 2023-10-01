@app.post("/upload")
async def upload_file(file: UploadFile = File(...)):
    contents = await file.read()
    # Do something with the contents of the uploaded file
    return {"filename": file.filename}
