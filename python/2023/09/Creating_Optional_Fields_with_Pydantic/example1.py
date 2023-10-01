from pydantic import BaseModel
from typing import Optional

class User(BaseModel):
    name: str
    age: Optional[int]
    email: str
