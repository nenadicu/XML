package application;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import model.TFizickoLice;
import model.ZahtevAutorskaPrava;


public class App {

	public static void main(String[] args) throws JAXBException {
		
		File file = new File("C:\\Users\\User\\XML\\zahtevAutorskaPrava\\resources\\zahtev_autorska_prava11.xml");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ZahtevAutorskaPrava.class);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		ZahtevAutorskaPrava zahtev = (ZahtevAutorskaPrava)unmarshaller.unmarshal(file);
		
		zahtev.getFizickoLice().setIme("Pera");
		zahtev.getFizickoLice().setPrezime("Peric");
		zahtev.getFizickoLice().getAdresa().setGrad("Novi Sad");
		zahtev.setEmail("pera.peric@gmail.com");
		zahtev.setTelefon(123456);
		
		File f1 = new File("resources\\zahtev.xml");
		
		marshaller.marshal(zahtev, f1);
		
		
		
		
		
			

	}

}
