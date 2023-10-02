# Select the first sheet of the spreadsheet
worksheet = sheet.get_worksheet(0)

# Clear any existing data in the sheet
worksheet.clear()

# Get the values from the DataFrame
values = df.values.tolist()

# Update the sheet with the new values
worksheet.update('A1', values)
