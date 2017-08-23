package util;

import model.Const;
import model.Player;

public class CardUtil {
	
	
	//pomocna medoda pre drawTopLine a drawBottomLine
	public String drawCustomLine(char a,char b,char c, Player player, boolean bo){
		StringBuilder line = new StringBuilder();
		int cardCount1 = player.getCards().size();
		
		if(bo){
		line.append(a);
		
		
		for(int i = 0; i < cardCount1;i++){
			if( i < cardCount1 -1){
				line.append(Const.HL).append(Const.HL).append(c);	
			}else{
				for(int j = 0; j< Const.CARD_SIZE_X -2 ; j++){
					line.append(Const.HL);
				}
			}
		
		}
		line.append(b);
		}else{
			line.append(a);
			
			
			for(int i = 0; i < cardCount1;i++){
				if( i == 0){
					for(int j = 0; j< Const.CARD_SIZE_X -2 ; j++){
						line.append(Const.HL);
					}	
				}else{
					line.append(c).append(Const.HL).append(Const.HL);
				}
			
			}
			line.append(b);
			
		}
		return line.toString();
	}

	
	public String drawTopLine(Player player1,Player player2,boolean a, boolean b){
		
		StringBuilder line = new StringBuilder();
	
		
		line.append(drawCustomLine(Const.ULC,Const.URC,Const.UJP,player1,a));
		line.append("                           ");
		line.append(drawCustomLine(Const.ULC,Const.URC,Const.UJP,player2,b));
		return line.toString();
	}
	
	public String drawBottomLine(Player player1,Player player2,boolean a, boolean b){
		
		StringBuilder line = new StringBuilder();
		
		line.append(drawCustomLine(Const.BLC,Const.BRC,Const.BJP,player1,a));
		line.append("                           ");
		line.append(drawCustomLine(Const.BLC,Const.BRC,Const.BJP,player2,b));
		

		
		return line.toString();
	}
	//pomocna medoda pre drawNumberLine
	public String drawCustomNumberLine(Player player,boolean a){
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		if(a){
		line.append(Const.VL);
		for(int i =0; i< cardCount; i++){
			
			String cardLabel = player.getCards().get(i).getValue().getLabel();
			int cardLabelLength = cardLabel.length();
			
			line.append(cardLabel);
			for(int j = 0; j < 2 - cardLabelLength;j++){
				line.append(Const.SPACE);
			}
			if (i == cardCount -1 ){
				for(int j = 0; j< Const.CARD_SIZE_X - 2*(cardLabelLength + 1);j++){
					line.append(Const.SPACE);
				}
				line.append(cardLabel);
			}
			line.append(Const.VL);
		}
		}else{
			
			line.append(Const.VL);
			for(int i =0; i< cardCount; i++){
				
				String cardLabel = player.getCards().get(i).getValue().getLabel();
				int cardLabelLength = cardLabel.length();
				
				line.append(cardLabel);
				for(int j = 0; j < 2 - cardLabelLength;j++){
					line.append(Const.SPACE);
				}
				if (i == 0 ){
					for(int j = 0; j< Const.CARD_SIZE_X - 2*(cardLabelLength + 1);j++){
						line.append(Const.SPACE);
					}
					line.append(cardLabel);
				}
				line.append(Const.VL);
			}
		}
		
		
		return line.toString();
	}
	
	public String drawNumberLine(Player player1,Player player2,boolean a, boolean b){
		StringBuilder line = new StringBuilder();
		
		line.append(drawCustomNumberLine(player1,a));
		line.append("                           ");
		line.append(drawCustomNumberLine(player2,b));
		
		return line.toString();
	}
	//pomocna medoda pre drawColorLine
	public String drawCustomColorLine(Player player,boolean a){
		StringBuilder line = new StringBuilder();
		
		int cardCount = player.getCards().size();
		
		if(a){
		line.append(Const.VL);
		for(int i =0; i< cardCount; i++){
			
			String cardLabel = player.getCards().get(i).getColor().getLabel();
			int cardLabelLength = cardLabel.length();
			
			line.append(Const.SPACE);
			for(int j = 0; j < 2 - cardLabelLength;j++){
				line.append(cardLabel);
			}
			if (i == cardCount -1 ){
				for(int j = 0; j< Const.CARD_SIZE_X - 2*(cardLabelLength + 2);j++){
					line.append(Const.SPACE);
				}
				line.append(cardLabel);
				line.append(Const.SPACE);
			}
			line.append(Const.VL);
		}
		}else{
			
			
			line.append(Const.VL);
			for(int i =0; i< cardCount; i++){
				
				String cardLabel = player.getCards().get(i).getColor().getLabel();
				int cardLabelLength = cardLabel.length();
				
				line.append(Const.SPACE);
				for(int j = 0; j < 2 - cardLabelLength;j++){
					line.append(cardLabel);
				}
				if (i == 0 ){
					for(int j = 0; j< Const.CARD_SIZE_X - 2*(cardLabelLength + 2);j++){
						line.append(Const.SPACE);
					}
					line.append(cardLabel);
					line.append(Const.SPACE);
				}
				line.append(Const.VL);
			}
			
		}
		
		return line.toString();		
	}
	
	public String drawColorLine(Player player1,Player player2,boolean a, boolean b){
		StringBuilder line = new StringBuilder();
		

		
		line.append(drawCustomColorLine(player1,a));
		line.append("                           ");
		line.append(drawCustomColorLine(player2,b));
		return line.toString();
	}
	
	//pomocna medoda pre drawBothEmptyLine
	public String drawEmptyLine(Player player, boolean a){
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		if(a){
		line.append(Const.VL);
			for(int i = 0; i < cardCount;i++){
				if( i < cardCount -1){
					line.append(Const.SPACE).append(Const.SPACE).append(Const.VL);	
				}else{
					for(int j = 0; j< Const.CARD_SIZE_X - 2 ; j++){
						line.append(Const.SPACE);
					}
				}
				
			}

		line.append(Const.VL);
		}else{
			line.append(Const.VL);
			for(int i = 0; i < cardCount;i++){
				if(i == 0){
					for(int j = 0; j< Const.CARD_SIZE_X - 2 ; j++){
						line.append(Const.SPACE);
					}	
				}else{
					line.append(Const.VL).append(Const.SPACE).append(Const.SPACE);
				}
				
			}

		line.append(Const.VL);
		}
		return line.toString();
	}
	public String drawBothEmptyLine(Player player1,Player player2,boolean a, boolean b){
		StringBuilder line = new StringBuilder();
		line.append(drawEmptyLine(player1,a));
		line.append("                           ");
		line.append(drawEmptyLine(player2,b));
		
		return line.toString();
	}
	
	
	//kazda z pomocnych metod ma boolean switch premennu pre kazdeho hraca
	public void drawPlayer(Player player1,Player player2,String name1,String name2, boolean a,boolean b){
			System.out.println("\n\n");
			System.out.println(name1   +   "                                                "  + name2 );
			System.out.println(drawTopLine(player1,player2,a,b));
			System.out.println(drawNumberLine(player1,player2,a,b));
			System.out.println(drawColorLine(player1,player2,a,b));
			for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
				System.out.println(drawBothEmptyLine(player1,player2,a,b));
			}
			System.out.println(drawColorLine(player1,player2,a,b));
			System.out.println(drawNumberLine(player1,player2,a,b));
			System.out.println(drawBottomLine(player1,player2,a,b));
			
		
	}
	
	
}
