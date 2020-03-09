
package miventana;
public class operaciones 
{
    int x,y,resultado;
    
    public void suma()
    {
        resultado = x + y;
    }
    public void resta()
    {
        resultado = x - y;
    }
    public void multiplicacion()
    {
        resultado = x*y;
    }
    public void division()
    {
        resultado = x/y;
    }
    public void setX(int theX)
    {
       this.x = theX;
    }
    public void setY(int theY)
    {
        this.y = theY;
    }
    
    public int getResultado()
    {
        return this.resultado;
    }
}
