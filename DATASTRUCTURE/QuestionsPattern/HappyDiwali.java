public class HappyDiwali {
    public static void main(String[] args) {
        int row,col,space=1;
        for(row=1;row<=5;row++){ 
            for(col=1;col<=5;col++){
              if(col==1||col==5||row==3){
              System.out.print("* ");
            }
          else{
            System.out.print("  ");
          }
            } 
            for(space=1;space<=3;space++)
            System.out.print("  ");
            for(col=1;col<=5;col++){
              if(col==1||col==5||row==1||row==3){
                System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }  
              }
              for(space=1;space<=3;space++)
              System.out.print("  ");
              for(col=1;col<=5;col++){
                if(col==1||row==3||row==1||(row==2&&col==5)){
                  System.out.print("* "); 
                } 
                else{
                  System.out.print("  ");
                }
                }
                for(space=1;space<=3;space++)
                System.out.print("  ");
                for(col=1;col<=5;col++){
                  if(col==1||row==3||row==1||(row==2&&col==5)){
                    System.out.print("* "); 
                  } 
                  else{
                    System.out.print("  ");
                  }
                }
                  for(space=1;space<=3;space++)
                  System.out.print(" ");
                  for(col=1;col<=5;col++){
                    if((col==5||col==row+1)){
                      System.out.print("* ");
                    }
                    else{
                      System.out.print("  ");
                    }  
                    }
              
            System.out.println();
        }
        System.out.println();
        for(row=1;row<=5;row++){ 
            for(space=1;space<=4;space++){
                System.out.print("  ");
            }
            for(col=1;col<=5;col++){
              if(col==2||col==5||row==1||row==5){
              System.out.print("* "); 
            }
            else{
              System.out.print("  ");
            } 
            } 
            for(space=1;space<=3;space++)
            System.out.print("  ");
            for(col=1;col<=5;col++){
              if(col==3||row==1||row==5){
                System.out.print("* "); 
              }
              else{
                System.out.print("  ");
              } 
              }
              for(space=1;space<=3;space++)
              System.out.print("  ");
              for(col=1;col<=5;col++){
                if(col==1||col==5||(col==3&&row==3)||(col==2&&row==4)||(col==4&&row==4)){
                  System.out.print("* ");  
                }
                else{
                  System.out.print("  ");
                }
              }
                for(space=1;space<=3;space++)
                System.out.print("  ");
                for(col=1;col<=5;col++){
                  if(col==1||col==5||row==1||row==3){
                    System.out.print("* ");
                  }
                  else{
                    System.out.print("  ");
                  } 
                  }
                  for(space=1;space<=3;space++)
                  System.out.print("  ");
                  for(col=1;col<=5;col++){
                    if(col==1||row==5){
                      System.out.print("* ");
                    }
                    else{
                      System.out.print("  ");
                    }  
                    }
                    for(space=1;space<=3;space++)
                    System.out.print("  ");
                    for(col=1;col<=5;col++){
                      if(col==3||row==1||row==5){
                        System.out.print("* "); 
                      }
                      else{
                        System.out.print("  ");
                      }  
                      }
              
            System.out.println();
        }
    }
}
