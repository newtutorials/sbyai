import plotly.express as px

df = px.data.tips()
fig = px.scatter(df, x="total_bill", y="tip", color="size", color_continuous_scale='Viridis')
fig.show()
