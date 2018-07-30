package com.nearix.g910controller;
public class LogiLedKeys {
  public static int random() {
    int range = (105 - 1) + 1;     
    return (int)(Math.random() * range) + 1; 
  } 
  public static int convertsingle(char Taste) {
    String eingabe = Character.toString(Taste);
    switch(eingabe) {
      case "1":
        return 2;    
      case "2":
        return 3;   
      case "3":
        return 4;   
      case "4":
        return 5;   
      case "5":
        return 6;   
      case "6":
        return 7;   
      case "7":
        return 8;   
      case "8":
        return 9;   
      case "9":
        return 10;   
      case "0":
        return 11;   
      case "ß":
        return 12;   
      case "´":
        return 13;    
      case "q":
        return 16;  
      case "w":
        return 17;  
      case "e":
        return 18;  
      case "r":
        return 19;  
      case "t":
        return 20;  
      case "z":
        return 21;  
      case "u":
        return 22;  
      case "i":
        return 23;  
      case "o":
        return 24;  
      case "p":
        return 25;  
      case "ü":
        return 26;  
      case "+":
        return 27;  
      case "a":
        return 30;  
      case "s":
        return 31;  
      case "d":
        return 32;  
      case "f":
        return 33;  
      case "g":
        return 34;  
      case "h":
        return 35;  
      case "j":
        return 36;  
      case "k":
        return 37;  
      case "l":
        return 38;  
      case "ö":
        return 39;  
      case "ä":
        return 40;  
      case "^":
        return 41;
      case "y":
        return 44;  
      case "x":
        return 45;  
      case "c":
        return 46;  
      case "v":
        return 47;  
      case "b":
        return 48;  
      case "n":
        return 49;  
      case "m":
        return 50;  
      case ",":
        return 51;  
      case ".":
        return 52;  
      case "-":
        return 53;  
      case "#":
        return 93;     
      default:
    	return 0;
    }
  }
  public static int convertmulti(String Taste) {
	    Taste = Taste.toUpperCase();
	    switch(Taste) {
	    	case "ESC":                    
	    		return 1;
	    	case "F1":                  
	    		return 59;
	    	case "F2":                 
	    		return 60;
	    	case "F3":                   
	    		return 61;
	    	case "F4":                    
	    		return 62;
	    	case "F5":                   
	    		return 63;
	    	case "F6":                     
	    		return 64;
	    	case "F7":                    
	    		return 65;
	    	case "F8":                     
	    		return 66;
	    	case "F9":                     
	    		return 67;
	    	case "F10":                    
	    		return 68;
	    	case "F11":                    
	    		return 87;
	    	case "F12":                    
	    		return 88;
	    	case "PRINT_SCREEN":           
	    		return 311;
	    	case "SCROLL_LOCK":            
	    		return 70;
	    	case "PAUSE_BREAK":            
	    		return 325;
	    	case "TILDE":                  
	    		return 41;
	    	case "EQUALS":                 
	    		return 13;
	    	case "BACKSPACE":              
	    		return 14;
	    	case "INSERT":                 
	    		return 338;
	    	case "HOME":                   
	    		return 327;
	    	case "PAGE_UP":                
	    		return 329;
	    	case "NUM_LOCK":               
	    		return 69;
	    	case "NUM_SLASH":              
	    		return 309;
	    	case "NUM_ASTERISK":           
	    		return 55;
	    	case "NUM_MINUS":             
	    		return 74;
	    	case "TAB":                    
	    		return 15;
	    	case "OPEN_BRACKET":           
	    		return 26;
	    	case "CLOSE_BRACKET":          
	    		return 27;
	    	case "BACKSLASH":              
	    		return 43;
	    	case "KEYBOARD_DELETE":        
	    		return 339;
	    	case "END":                    
	    		return 335;
	    	case "PAGE_DOWN":              
	    		return 337;
	    	case "NUM_SEVEN":              
	    		return 71;
	    	case "NUM_EIGHT":              
	    		return 72;
	    	case "NUM_NINE":               
	    		return 73;
	    	case "NUM_PLUS":               
	    		return 78;
	    	case "CAPS_LOCK":              
	    		return 58;
	    	case "SEMICOLON":              
	    		return 39;
	    	case "APOSTROPHE":             
	    		return 40;
	    	case "ENTER":                  
	    		return 28;
	    	case "NUM_FOUR":               
	    		return 59;
	    	case "NUM_FIVE":               
	    		return 60;
	    	case "NUM_SIX":                
	    		return 61;
	    	case "LEFT_SHIFT":             
	    		return 42;
	    	case "FORWARD_SLASH":          
	    		return 53;
	    	case "RIGHT_SHIFT":            
	    		return 54;
	    	case "ARROW_UP":               
	    		return 328;
	    	case "NUM_ONE":                
	    		return 79;
	    	case "NUM_TWO":                
	    		return 80;
	    	case "NUM_THREE":              
	    		return 81;
	    	case "NUM_ENTER":              
	    		return 284;
	    	case "LEFT_CONTROL":           
	    		return 29;
	    	case "LEFT_WINDOWS":           
	    		return 347;
	    	case "LEFT_ALT":               
	    		return 56;
	    	case "SPACE":                  
	    		return 57;
	    	case "RIGHT_ALT":              
	    		return 312;
	    	case "RIGHT_WINDOWS":          
	    		return 348;
	    	case "APPLICATION_SELECT":     
	    		return 349;
	    	case "RIGHT_CONTROL":          
	    		return 285;
	    	case "ARROW_LEFT":             
	    		return 331;
	    	case "ARROW_DOWN":             
	    		return 336;
	    	case "ARROW_RIGHT":            
	    		return 333;
	    	case "NUM_ZERO":               
	    		return 82;
	    	case "NUM_PERIOD":             
	    		return 83;
	    	case "G1":                    
	    		return 65521;
	    	case "G2":                    
	    		return 65522;
	    	case "G3":                    
	    		return 65523;
	    	case "G4":                    
	    		return 65524;
	    	case "G5":                    
	    		return 65525;
	    	case "G6":                    
	    		return 65526;
	    	case "G7":                    
	    		return 65527;
	    	case "G8":                    
	    		return 65528;
	    	case "G9":                    
	    		return 65529;
	    	case "GLOGO":                 
	    		return 1048561;
	    	case "GBADGE":                
	    		return 1048562;
	      default:
	    	return 0;
	    }
	  }
  public static int convertRandom(int rdm) {
	  int key = rdm;
	  int out = 0;
	  if(key >= 1 && key <= 83) {
		  out = key;
	  }
	  if(key >= 84 && key <= 85) {
		  out = (key + 3);
	  }
	  if(key >= 86 && key <= 87) {
		  out = (key + 198);
	  }
	  if(key == 88) {
		  out = 309;
	  }
	  if(key >= 89 && key <= 90) {
		  out = (key + 222);
	  }
	  if(key == 91) {
		  out = 325;
	  }
	  if(key >= 92 && key <= 94) {
		  out = (key + 235);
	  }
	  if(key == 95) {
		  out = 331;
	  }
	  if(key == 96) {
		  out = 333;
	  }
	  if(key >= 97 && key <= 101) {
		  out = (key + 238);
	  }
	  if(key >= 102 && key <= 104) {
		  out = (key + 245);
	  }
	  if(key >= 105 && key <= 113) {
		  out = (key + 65416);
	  }
	  if(key >= 114 && key <= 115) {
		  out = (key + 1048447);
	  }
	  if(key == 116) {
		  out = 86;
	  }
	  if(key == 117) {
		  out = 93;
	  }
	  return out;
  }
}