public class mainApplication {
    
    public static void main(String args[]) {
        TabelaHash<String, String> t = new TabelaHash<String, String>(52);
        System.out.println(t.getM());

        //impede de criar
        t.add("annymakeup.com.br", "36.40.47.120");
		t.add("artepress.com.br", "196.219.90.59");
		t.add("atacadomania.com.br", "207.126.60.95");
		t.add("atrativamoveis.com.br", "182.169.164.151");
		t.add("azurramoveis.com.br", "135.93.188.7");
		t.add("bbarato.com", "239.85.89.189");
		t.add("bcmagazine.com.br", "37.230.86.155");
		t.add("belezaexpressa.com", "38.93.163.217");
		t.add("www.yale.edu", "130.132.143.21");
		t.add("www.simpsons.com", "209.052.165.60");
		t.add("www.apple.com", "17.112.152.32");
		t.add("www.amazon.com", "207.171.182.16");
		t.add("www.ebay.com", "66.135.192.87");
		t.add("www.cnn.com", "64.236.16.20");
		t.add("www.google.com", "216.239.41.99");
		t.add("www.nytimes.com", "199.239.136.200");
		t.add("www.microsoft.com", "207.126.99.140");
		t.add("www.dell.com", "143.166.224.230");
		t.add("www.slashdot.org", "66.35.250.151");
		t.add("www.espn.com", "199.181.135.201");
		t.add("www.weather.com", "63.111.66.11");
		t.add("www.yahoo.com", "216.109.118.65");
		t.add("02eventos.com.br", "101.96.42.74");
		t.add("amkg.com.br", "253.118.235.147");
		t.add("belgrand.com.br", "224.17.235.199");
		t.add("birobiro.com.br", "150.36.0.160");
		t.add("boxeletro.com.br", "52.90.50.132");
		t.add("buscavantagem.com.br", "122.12.41.176");
		t.add("caraveleshop.com.br", "220.59.81.36");
		t.add("cardozoeletro.com.br", "189.88.136.54");
		t.add("centernot.com.br", "229.49.213.8");
		t.add("ciadaslentes.com.br", "101.226.24.123");
		t.add("cicilia.com.br", "1.60.27.3");
		t.add("corpetesbrasil.com.br", "8.199.200.216");
		t.add("corpoperfeito.com.br", "119.11.72.253");
		t.add("docolmoveis.com.br", "221.246.71.68");
		t.add("eletroalba.com.br", "15.234.9.74");
		t.add("estilomenina.com.br", "33.5.13.230");
		t.add("friturasemoleo.com.br", "204.24.127.197");
		t.add("habitomoveis.com.br", "236.169.106.3");
		t.add("horuseletronicos.com.br", "71.205.147.85");
		t.add("imperioglassdecor.com.br", "99.39.166.34");
		t.add("infonot.com.br", "245.225.131.162");
		t.add("jumbomagazine.com.br", "73.22.33.191");
		t.add("ksleletronicos.com.br", "240.83.78.153");
		t.add("lalunacosmetics.com.br", "70.15.201.254");
		t.add("larmovel.com.br", "86.94.251.192");
		t.add("lifeshoptv.com.br", "49.158.120.67");
		t.add("localdoeletro.com.br", "204.159.193.86");
		t.add("lojafrozen.com.br", "91.31.165.76");
		t.add("lojasfantini.com.br", "70.206.123.162");
		t.add("mercadoMalhas.com.br", "17.113.236.25");
		t.add("DonaIrenaDoida.com.br", "157.237.49.148");

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