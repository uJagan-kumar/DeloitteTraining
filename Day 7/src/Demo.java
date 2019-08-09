
class Demo{   
                int count = 0;
    void Second() throws Exception
    {
        try
        {
            this.count++;
            
            try
            {
               this. count++;

                try
                {
                    this.count++;
                    throw new Exception();

                }
                
                catch(Exception ex)
                {
                    this.count++;
                    throw new Exception();
                }
            }
            
            catch(Exception ex)
            {
                this.count++;
            }
        }
        
        catch(Exception ex)
        {
            this.count++;
        }

    }

    void display()
    {
        System.out.println(this.count);
    }
}
class Demo2 {
    public static void main(String[] args) throws Exception
    {
      Demo obj = new Demo();
        obj.Second();
        obj.display();

    }
}