import plotly.express as px

df = px.data.tips()
fig = px.box(df, x="time", y="total_bill", color="#FFA500")  # Orange color in HEX format
fig.show()
