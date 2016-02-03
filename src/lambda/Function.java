package lambda;

public interface Function<Ret, T> {
	Ret call(T param);
}
