from flask import Flask, render_template
import plotly.express as px
import plotly.io as pio

app = Flask(__name__)

@app.route('/')
def index():
    fig = px.line(x=[0, 1, 2, 3], y=[10, 11, 12, 13], title="Meu Gráfico")
    graph_html = pio.to_html(fig, full_html=False)
    return render_template('index.html', graph_html=graph_html)

if __name__ == '__main__':
    app.run(debug=True)
