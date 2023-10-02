# Importing necessary libraries
import pandas as pd

# Creating a DataFrame
data = {'datetime': ['2021-01-01 10:00:00', '2021-01-02 12:00:00', '2021-01-03 14:00:00']}
df = pd.DataFrame(data)

# Converting 'datetime' column to date
df['date'] = df['datetime'].astype('datetime64[ns]').dt.date

# Checking the data type of 'date' column
print(df['date'].dtype)
