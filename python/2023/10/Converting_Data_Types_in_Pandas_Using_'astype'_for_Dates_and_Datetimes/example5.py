# Importing necessary libraries
import pandas as pd

# Creating a DataFrame
data = {'date': ['2021-01-01', '2021-01-02', '2021-01-03']}
df = pd.DataFrame(data)

# Converting 'date' column to string
df['date_str'] = df['date'].astype('str')

# Checking the data type of 'date_str' column
print(df['date_str'].dtype)
