package modulo_14_TelaJDialog_comThreads;

import javax.swing.JDialog;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Tela extends JDialog{
//criando os componentes para ser usado no construtor.
 private JLabel descricaoHora1 = new JLabel("Time Thread 1");
 private JTextField mostrarTempo1 = new JTextField();
 private JLabel descricaoHora2 = new JLabel("Time Thread 2");
 private JTextField mostrarTempo2 = new JTextField();
 
 private JPanel painel = new JPanel();
 
//Construtor
public Tela() {
    //configuração da tela. como tamanho e dimensões
	setTitle("Minha tela de Time com Thread");//titulo da tela
	setSize(new DimensionUIResource(260,260));//coloca a dimensão da tela
	setLocationRelativeTo(null);// deixa a tela centralizada
	setResizable(false);//não permite redimensionar a tela
// fim da configuração da tela ///
/////////////////////////////////////////////////////////////////////////////////

// Definir um controlador de componetes que funciona feito uma tabela onde o x é 
// a linha e o Y a coluna.
	
	GridBagConstraints grid = new GridBagConstraints();
	grid.gridx = 0;
    grid.gridy = 0;	
	
//////////////////////////////////////////////////////////////////////////////////

// adicionando os componentes e colocando as dimensões e adicionamos ao painel,
// pois todos componentes fica dentro de um painel e depois adicionamos o painel
// ao JDialog atraves do construtor da classe, como ele extends do JDialogJDialog.
    
    descricaoHora1.setPreferredSize(new DimensionUIResource(200,25));
    painel.add(descricaoHora1, grid);//ele recebe o objeto e o grid que é o posicionamento
    
    mostrarTempo1.setPreferredSize(new DimensionUIResource(200,25));
    grid.gridy ++;
    painel.add(mostrarTempo1, grid);
    
    descricaoHora2.setPreferredSize(new DimensionUIResource(200,25));
    painel.add(descricaoHora2, grid);
    
    mostrarTempo2.setPreferredSize(new DimensionUIResource(200,25));
    grid.gridy ++;
    painel.add(mostrarTempo2, grid);
    
    
    add(painel);// adicionando o painel ao JDialog
	setVisible(true);// vai ser sempre o último comando a ser executado. ele possi,
	//bilita a visualização da tela.
}
	
}
