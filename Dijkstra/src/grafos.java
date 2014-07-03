import java.util.ArrayList;
import java.util.List;

public class grafos {

	private List<vertices> grafoList = new ArrayList<vertices>();

	public void adicionarVertice(vertices novoVertice) {
		this.grafoList.add(novoVertice);
	}

	public List<vertices> getVertices() {
		return this.grafoList;
	}

	// Método que retorna o vértice cuja a descrição é igual à procurada.
	public vertices findVertice(String nome) {
		for (int i = 0; i < this.getVertices().size(); i++) {
			if (nome.equalsIgnoreCase(this.getVertices().get(i).getDescricao())) {
				return this.getVertices().get(i);
			}
		}
		return null;
	}
}