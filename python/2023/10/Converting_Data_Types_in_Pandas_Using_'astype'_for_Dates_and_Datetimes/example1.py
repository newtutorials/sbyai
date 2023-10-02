# Importing necessary libraries
import pandas as pd

# Creating a DataFrame
data = {'date': ['2021-01-01', '2021-01-02', '2021-01-03']}
df = pd.DataFrame(data)

# Converting 'date' column to datetime
df['date'] = df['date'].astype('datetime64[ns]')

# Checking the data type of 'date' column
print(df['date'].dtype)
