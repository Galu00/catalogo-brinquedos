package com.example.catalogobrinquedos.seeder;

import com.example.catalogobrinquedos.model.Toy;
import com.example.catalogobrinquedos.repository.ToyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ToySeeder implements CommandLineRunner {
    private final ToyRepository toyRepository;

    public ToySeeder(ToyRepository toyRepository){
        this.toyRepository = toyRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Toy toy1 = new Toy(
                "Avião",
                Toy.ToyCategory.ACTION_FIGURE,
                "marcaExemplo",
                "https://media.istockphoto.com/id/182176558/pt/foto/carrinho-de-brinquedo.webp?s=2048x2048&w=is&k=20&c=NOHRyuJ9xR_PooKRlQYnXiL42V9ybUv479j9kA3KuW4=",
                "Carro rápido com bateria recarregável.",
                150.0
        );
        Toy toy2 = new Toy(
                "Boneca Falante",
                Toy.ToyCategory.DOLL,
                "marcaExemplo",
                "https://media.istockphoto.com/id/841781266/pt/foto/cute-little-plastic-baby-doll-isolated-on-white-background.webp?s=2048x2048&w=is&k=20&c=6dEeQ_VE-gVQMnieym4dz6RKiTnea0LNFKgPcHL0wPk=",
                "Boneca que fala diversas frases.",
                120.0
        );
        Toy toy3 = new Toy(
                "Kit de Construção",
                Toy.ToyCategory.PUZZLE,
                "marcaExemplo",
                "https://media.istockphoto.com/id/465902290/pt/foto/a-equipa-doworkmanmini-figuras-lego-construir-uma-parede.webp?s=2048x2048&w=is&k=20&c=s5ut6d0rpVvAnVJpAeNvb7tCD-NJkeKrYyV2EtuAlvA=",
                "Blocos de montar.",
                80.0
        );

        List<Toy> toys = Arrays.asList(toy1, toy2, toy3);

        toyRepository.deleteAll();
        toyRepository.saveAll(toys);
    }
}
