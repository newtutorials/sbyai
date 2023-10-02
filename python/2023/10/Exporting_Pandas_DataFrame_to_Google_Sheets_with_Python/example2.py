import gspread
from oauth2client.service_account import ServiceAccountCredentials

# Define the scope for accessing Google Sheets
scope = ['https://spreadsheets.google.com/feeds',
         'https://www.googleapis.com/auth/drive']

# Load credentials from the JSON file
credentials = ServiceAccountCredentials.from_json_keyfile_name(
    'path_to_credentials.json', scope)

# Authorize the credentials
client = gspread.authorize(credentials)
