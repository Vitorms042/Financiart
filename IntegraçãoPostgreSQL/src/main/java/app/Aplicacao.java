package app;

import java.util.List;
import java.util.Scanner;
import dao.DAO;
import dao.UsuarioDAO;
import model.Usuario;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		int opcao;
        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Listar Usuários");
            System.out.println("2. Inserir Usuário");
            System.out.println("3. Excluir Usuário");
            System.out.println("4. Atualizar Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
                		
            switch(opcao) {
            case 1: 
            	System.out.println("\n\n==== Usuários ordenados por código === ");
            	List<Usuario> usuarios = usuarioDAO.getOrderByCodigo();
        		for (Usuario u: usuarios) {
        			System.out.println(u.toString());
        		}
                 break;
            case 2:
            	System.out.println("\n\n==== Inserir usuário === ");
            	System.out.println("Digite o codigo do usuario: ");
                int codigoUsuario = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o Nome do Usuario: ");
                String nomeUsuario = scanner.nextLine();
                System.out.println("Digite a senha: ");
                String sobrenomeUsuario = scanner.nextLine();
                System.out.println("Digite M para masculino ou F para feminino: ");
                char sexoUsuario = scanner.next().charAt(0);
        		Usuario usuario = new Usuario(codigoUsuario, nomeUsuario, sobrenomeUsuario,sexoUsuario);
        		if(usuarioDAO.insert(usuario) == true) {
        			System.out.println("Inserção com sucesso -> " + usuario.toString());
        		}
                 break;
            case 3:
            	System.out.println("\n==== Excluir Usuário ====");
                System.out.print("Digite o código do usuário a ser excluído: ");
                int codigoExclusao = scanner.nextInt();
                usuarioDAO.delete(codigoExclusao);
                System.out.println("Usuário excluído com sucesso.");
        		break;
            case 4:
            	 System.out.println("\n==== Atualizar Usuário ====");
            	    System.out.print("Digite o código do usuário a ser atualizado: ");
            	    int codigoAtualizacao = scanner.nextInt();
            	    
            	    Usuario usuarioExistente = usuarioDAO.get(codigoAtualizacao);
            	    
            	    if (usuarioExistente != null) {
            	        System.out.print("Novo login: ");
            	        String novoLogin = scanner.next();
            	        
            	        System.out.print("Nova senha: ");
            	        String novaSenha = scanner.next();
            	        
            	        System.out.print("Novo sexo (M/F): ");
            	        char novoSexo = scanner.next().charAt(0);
            	        
            	        // Atualize os campos do usuário existente
            	        usuarioExistente.setLogin(novoLogin);
            	        usuarioExistente.setSenha(novaSenha);
            	        usuarioExistente.setSexo(novoSexo);
            	        
            	        // Chame o método update do usuarioDAO para atualizar o usuário
            	        boolean atualizacaoSucesso = usuarioDAO.update(usuarioExistente);
            	        
            	        if (atualizacaoSucesso) {
            	            System.out.println("Usuário atualizado com sucesso.");
            	        } else {
            	            System.out.println("Falha ao atualizar o usuário.");
            	        }
            	    } else {
            	        System.out.println("Usuário não encontrado.");
            	    }
            	    break;
            case 5:
            	System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida.");
        }
        }while(opcao != 5);
        
        scanner.close();
       
	}
}

		//System.out.println("\n\n==== Testando autenticação ===");
		//System.out.println("Usuário (" + usuario.getLogin() + "): " + usuarioDAO.autenticar("pablo", "pablo"));

		//System.out.println("\n\n==== Testando autenticação ===");
		//System.out.println("Usuário (" + usuario.getLogin() + "): " + usuarioDAO.autenticar("pablo", DAO.toMD5("pablo")));		
		
		//System.out.println("\n\n==== Invadir usando SQL Injection ===");
		//System.out.println("Usuário (" + usuario.getLogin() + "): " + usuarioDAO.autenticar("pablo", "x' OR 'x' LIKE 'x"));