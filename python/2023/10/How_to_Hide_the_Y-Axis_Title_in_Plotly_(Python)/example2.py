import plotly.graph_objects as go

# Create a sample scatter plot
fig = go.Figure(data=go.Scatter(x=[1, 2, 3], y=[4, 5, 6]))

# Hide the y-axis title
fig.update_layout(yaxis_title_text=None)

# Show the plot
fig.show()
