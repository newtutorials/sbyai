import plotly.graph_objects as go

# Create a sample scatter plot
fig = go.Figure(data=go.Scatter(x=[1, 2, 3], y=[4, 5, 6]))

# Access the layout object
layout = fig['layout']

# Set the visibility of the y-axis title to False
layout['yaxis']['title']['text'] = None

# Show the plot
fig.show()
