public class mainApplication {
    
    public static void main(String args[]) {
        Set<String> t = new Set<String>(52);
        System.out.println(t.getM());

        //impede de criar
        t.add("annymakeup.com.br");
		t.add("artepress.com.br");
		t.add("atacadomania.com.br");
		t.add("atrativamoveis.com.br");
		t.add("azurramoveis.com.br");
		t.add("bbarato.com");
		t.add("bcmagazine.com.br");
		t.add("belezaexpressa.com");
		t.add("www.yale.edu");
		t.add("www.simpsons.com");
		t.add("www.apple.com");
		t.add("www.amazon.com");
		t.add("www.ebay.com");
		t.add("www.cnn.com");
		t.add("www.google.com");
		t.add("www.nytimes.com");
		t.add("www.microsoft.com");
		t.add("www.dell.com");
		t.add("www.slashdot.org");
		t.add("www.espn.com");
		t.add("www.weather.com");
		t.add("www.yahoo.com");
		t.add("02eventos.com.br");
		t.add("amkg.com.br");
		t.add("belgrand.com.br");
		t.add("birobiro.com.br");
		t.add("boxeletro.com.br");
		t.add("buscavantagem.com.br");
		t.add("caraveleshop.com.br");
		t.add("cardozoeletro.com.br");
		t.add("centernot.com.br");
		t.add("ciadaslentes.com.br");
		t.add("cicilia.com.br");
		t.add("corpetesbrasil.com.br");
		t.add("corpoperfeito.com.br");
		t.add("docolmoveis.com.br");
		t.add("eletroalba.com.br");
		t.add("estilomenina.com.br");
		t.add("friturasemoleo.com.br");
		t.add("habitomoveis.com.br");
		t.add("horuseletronicos.com.br");
		t.add("imperioglassdecor.com.br");
		t.add("infonot.com.br");
		t.add("jumbomagazine.com.br");
		t.add("ksleletronicos.com.br");
		t.add("lalunacosmetics.com.br");
		t.add("larmovel.com.br");
		t.add("lifeshoptv.com.br");
		t.add("localdoeletro.com.br");
		t.add("lojafrozen.com.br");
		t.add("lojasfantini.com.br");
		t.add("mercadoMalhas.com.br");
		t.add("DonaIrenaDoida.com.br");

        t.exibirTabela();

        System.out.println(t.get("DonaIrenaDoida.com.br"));

        t.remove("lojasfantini.com.br");
        t.remove("DonaIrenaDoida.com.br");
        t.remove("ksleletronicos.com.br");
        t.remove("estilomenina.com.br");
        t.remove("docolmoveis.com.br");
        t.remove("ciadaslentes.com.br");
        t.remove("mercadoMalhas.com.br");
        t.remove("larmovel.com.br");
        t.remove("www.microsoft.com");
		t.remove("www.dell.com");
		t.remove("www.slashdot.org");
        t.remove("www.espn.com");
        
        //tenta remover um valor q n existe
        t.remove("www.comiocudequemtalendo.com");

        t.exibirTabela();
    }
}