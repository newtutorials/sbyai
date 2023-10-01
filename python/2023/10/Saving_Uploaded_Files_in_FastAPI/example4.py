import shutil
import tempfile

@app.post("/upload")
async def upload_file(file: UploadFile = File(...)):
    # Create a temporary file and save the uploaded file
    temp_file = tempfile.NamedTemporaryFile(delete=False)
    try:
        shutil.copyfileobj(file.file, temp_file)
        temp_file.close()
    finally:
        file.file.close()
    return {"filename": file.filename}
