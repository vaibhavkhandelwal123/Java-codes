import java.io.IOException;
class checked_exeption {
    void m()throws IOException 
    {        
        throw new IOException("device error"); 
        }   
        void n() throws IOException
        {   
            m();            
        } 
        void p()    
        {        
            try
            {
                n();            
                }   
                catch(Exception e)
                {
                    System.out.println("exception handled");    
                    
                }
                }
                public static void main(String[] args) 
                {        
                checked_exeption obj=new checked_exeption();        
                obj.p();        
                System.out.println("normal flow");  
                }}
