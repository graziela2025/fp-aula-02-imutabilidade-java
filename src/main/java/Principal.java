import exercicios.CidadeMutavel;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        System.out.println("--- Testando CidadeRecord ---");
        CidadeRecord palmas = new CidadeRecord("Palmas (TO)"); // alterado
        System.out.println("Cidade Record: " + palmas);
        System.out.println("Nome da cidade (Record): " + palmas.nome());

        System.out.println("\n--- Testando CidadeMutavel ---");
        CidadeMutavel portoNacional = new CidadeMutavel("Porto Nacional (TO)"); // alterado
        System.out.println("Cidade Mutável (inicial): " + portoNacional.getNome());
        portoNacional.setNome("Porto Nacional - TO"); // alterado
        System.out.println("Cidade Mutável (alterada): " + portoNacional.getNome());

        System.out.println("\n--- Testando PessoaRecordShallow ---");
        CidadeMutavel gurupi = new CidadeMutavel("Gurupi (TO)"); // alterado
        PessoaRecordShallow ana = new PessoaRecordShallow("Ana", gurupi); // alterado
        System.out.println("Pessoa Record Shallow (inicial): " + ana);
        System.out.println("Nome da pessoa: " + ana.nome());
        System.out.println("Cidade da pessoa (mutável): " + ana.cidadeMutavel().getNome());

        // Alterando a cidade atraves da referencia na PessoaRecordShallow
        ana.cidadeMutavel().setNome("Gurupi - TO"); // alterado
        System.out.println("Cidade da pessoa (mutável, alterada via pessoa): " + ana.cidadeMutavel().getNome());

        // Alterando a cidade diretamente
        gurupi.setNome("GURUPI"); // alterado
        System.out.println("Cidade da pessoa (mutável, alterada diretamente): " + ana.cidadeMutavel().getNome());

        System.out.println("\n--- Testando PessoaRecord ---");
        CidadeRecord araguaina = new CidadeRecord("Araguaína (TO)"); // alterado
        PessoaRecord beatriz = new PessoaRecord("Beatriz", araguaina); // alterado
        System.out.println("Pessoa Record: " + beatriz);
        System.out.println("Nome da pessoa: " + beatriz.nome());
        System.out.println("Cidade da pessoa (Record): " + beatriz.cidade().nome());

        // Tentativa de alterar o nome da cidade atraves da referencia (não permitido em Record)
        // araguaina.setNome("ARA"); // Isso geraria um erro de compilação se descomentado

        System.out.println("\n--- Demonstração da Imutabilidade do Record ---");
        CidadeRecord paraiso = new CidadeRecord("Paraíso do Tocantins"); // alterado
        PessoaRecord camila = new PessoaRecord("Camila", paraiso); // alterado
        System.out.println("Pessoa Record 5 (inicial): " + camila);
        CidadeRecord novoParaiso = new CidadeRecord("Paraíso - TO"); // alterado
        // camila = new PessoaRecord("Gra", novoParaiso); // cria uma nova instancia de PessoaRecord
        System.out.println("Pessoa Record 5 (após 'alteração' da cidade): " + camila);
        System.out.println("Cidade original: " + paraiso);
        System.out.println("Nova cidade (não atribuída ao objeto original): " + novoParaiso);
    }
}
