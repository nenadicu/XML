package application;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import model.Patent;

public class App {
	//Nisam sad ispisivao celu semu, samo sam stavio da moze da se prikaze da se vidi promena
	public static void ispisi(Patent patent){
		
		System.out.println(patent.getDrzavljanstvo());
		System.out.println(patent.getNazivPronalaskaSrb());
		System.out.println(patent.getNazivPronalaskaEng());
		System.out.println(patent.getPodnosilacPrijave().getImePrezime());

	}

	public static void main(String[] args) throws JAXBException {
		
		File file = new File("C:\\Users\\Uros\\Desktop\\XML\\XML\\zahtevPatent\\resources\\PatentRandom.xml");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Patent.class);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		Patent patent = (Patent)unmarshaller.unmarshal(file);
		
		ispisi(patent);

		patent.setDrzavljanstvo("Eskim");
        patent.setNazivPronalaskaEng("Something on english");
        patent.setNazivPronalaskaSrb("Nesto na nasem");
		patent.getPodnosilacPrijave().setImePrezime("Uros Nenadic");;
		
		System.out.println("==========================================");

		ispisi(patent);
		File f1 = new File("resources\\PatentNovi.xml");
		
		marshaller.marshal(patent, f1);
		
		
	}

}