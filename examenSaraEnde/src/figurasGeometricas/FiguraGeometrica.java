package figurasGeometricas;
/**
 * @version 1.0
 * @author dw1a
 * @see otraClaseAlaQueHagaReferencia
 */

public abstract class FiguraGeometrica 
{
	protected double valor;
	/**
	 * 
	 * @param valor cualEsElValor
	 */
	
	public FiguraGeometrica(double valor)
	{
		this.valor = valor;
		/**
		 * @see valor valor
		 */
	}
	
	
	public abstract double getArea();
	/**
	 * 
	 * @return valor
	 */
	
	public abstract double getPerimetro();
	/**
	 * 
	 * @return valor
	 */
	
	public void setValor(double valor) 
	{
		this.valor = valor;
		/**
		 * @see valor valor
		 */
	}
	
	
	public double getValor() 
	{
		return valor;
		/**
		 * @return valor
		 */
	}

}
