import java.util.Scanner;

public class RedBlackTreeTest {
	 /* Class RedBlackTreeTest */
	     public static void main(String[] args)
	     {            
	        Scanner scan = new Scanner(System.in);
	        /* Creating object of RedBlack Tree */
	        RBTree rbt = new RBTree(Integer.MIN_VALUE); 
	        System.out.println("Arvore Red Black\n");          
	        char ch;
	        /*  Perform tree operations  */
	        do    
	        {
	            System.out.println("\nOperacoes Arvore Red Black\n");
	            System.out.println("1. Inserir ");
	            System.out.println("2. Buscar");
	            System.out.println("3. Quantidade de Elementos");
	            System.out.println("4. Verificar se esta vazio");
	            System.out.println("5. Limpar Arvore RB");
	 
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.print("Digite um numero inteiro para insercao: ");
	                rbt.insert( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.print("Digite um numero inteiro para Busca: ");
	                System.out.print("Resultado da Busca: "+ rbt.search( scan.nextInt() ));
	                break;                                          
	            case 3 : 
	                System.out.print("Elementos = "+ rbt.countNodes());
	                break;     
	            case 4 : 
	                System.out.print("Status vazio = "+ rbt.isEmpty());
	                break;     
	            case 5 : 
	                System.out.println("\nArvore Limpa!");
	                rbt.makeEmpty();
	                break;         
	            default : 
	                System.out.println("Entrada de dados incorreta\n");
	                break;    
	            }
	            /*  Display tree  */
	            System.out.print("\nPost order: ");
	            rbt.postorder();
	            System.out.print("\nPre order: ");
	            rbt.preorder();
	            System.out.print("\nIn order: ");
	            rbt.inorder(); 
	 
	            System.out.print("\nVoce quer continuar? (Digite s para continuar): ");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'S'|| ch == 's');               
	        scan.close();
	     }	
}