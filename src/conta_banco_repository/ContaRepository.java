package conta_banco_repository;

import conta_banco.model.Conta;

public interface ContaRepository {

	// CRUD

	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(Conta conta);

	public void atualizar(Conta conta);

	public void deletar(int numero);

	// Metodo bancario

	public void sacar(int numero, float valor);

	public void depositar(int numero, float valor);

	public void transferir(int numeroOrigem, int numeroDestino, float valor);


}
