package conta_bancocontroller;

import java.util.ArrayList;

import conta_banco.model.Conta;
import conta_banco_repository.ContaRepository;

public class ContaController implements ContaRepository {

	// criar a collection
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarnaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A Conta número :" + numero + "não foi encontrada");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A conta numero :" + conta.getNumero() + "foi criada com Sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarnaCollection(numero);

		if (conta != null) {
			if(listaContas.remove(conta)== true)
				System.out.println("A Conta número: " + numero + " foi excluida com sucesso!");
		}else
			System.out.println("A Conta número :" + numero + "não foi encontrada");


	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarnaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}
		return null;
	}

}
