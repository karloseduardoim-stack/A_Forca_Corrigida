package força_corrigida;
import javax.swing.JOptionPane;
public class forca {
public static void main(String[]args) {
	
	int npalavra=0;
	
	npalavra=Integer.parseInt(JOptionPane.showInputDialog("A palavra terá quantas letras?"));
	
    String palavras[]=new String [npalavra];
    String apalavras[]=new String [npalavra];
  
    String tentativa="";
    
    do {
  
 for (int i=0; i<npalavra; i++) {
	 
	 palavras[i]=JOptionPane.showInputDialog("Soletre as letras que\nFormem a palavra escolhida ");
	 
	 
	 
      apalavras[i]=JOptionPane.showInputDialog("Qual as letras da Palavra escolhida??");
 
	 if (palavras==apalavras)  {
		 
		JOptionPane.showMessageDialog(null, "Acertou! A Letra está correta!\n Essa letra: " +apalavras+" está na palavra "+ palavras); 
		 
	 }
	 else if(palavras!=apalavras) {
			JOptionPane.showMessageDialog(null, "Você errou☹\n A letra Não Está presente= "+ apalavras ); 	
			tentativa=JOptionPane.showInputDialog("Você perdeu uma vida: O \n Deseja ir de novo?");
	 }
	 
 }


 }while(tentativa.equals("sim"));
 
    
}
}