package slides;

public interface IPlayer {
	
	public static final int POS_INICIAL_X = 200;
	public static final int POS_INICIAL_Y = 300;

	public abstract void iniciar();
	public abstract void mover(int x, int y, int velocidade);
	public abstract void apontar(int x, int y);
	public abstract void atirar();
	public abstract void sair();
	
}
