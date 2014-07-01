public class aresta {

	private int peso;
	private vertices origem;
	private vertices destino;

	public aresta(vertices v1, vertices v2) {
		this.peso = 1;
		this.origem = v1;
		this.destino = v2;
		v1.getArestas().add(this);
	}

	public void setPeso(int novoPeso) {
		this.peso = novoPeso;
	}

	public int getPeso() {
		return peso;
	}

	public void setDestino(vertices destino) {
		this.destino = destino;
	}

	public vertices getDestino() {
		return destino;
	}

	public void setOrigem(vertices origem) {
		this.origem = origem;
	}

	public vertices getOrigem() {
		return origem;
	}

}