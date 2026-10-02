package br.com.luizvictor.minha_primeira_atividade_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloController {

    @GetMapping("/sobre")
    public String sobre(){
        return "Bem-vindo à Oficina AutoCenter Express! Especialistas em manutenção preventiva, diagnósticos automotivos e reparos mecânicos gerais.";
    }

    @GetMapping("/servicos")
    public String servicos(){
        return "Serviços disponíveis: 1. Troca de óleo e filtros | 2. Alinhamento e balanceamento | 3. Revisão do sistema de freios | 4. Limpeza de bicos e injeção eletrônica | 5. Revisão da suspensão.";
    }

    @GetMapping("/horario")
    public String horario(){
        return "Horário de Funcionamento: Segunda a Sexta das 08h às 18h | Sábados das 08h às 12h | Domingos e Feriados: Fechado.";
    }

    @GetMapping("/contato")
    public String contato(){
        return "Contatos da Oficina: Telefone / WhatsApp: (11) 99999-0000 | Endereço: Rua dos Mecânicos, nº 123 - Centro | E-mail: contato@oficinaautocenter.com";
    }

    @GetMapping("/dica-preventiva")
    public String dicaPreventiva(){
        return "Dica do Mecânico: Verifique o nível do óleo do motor a cada 15 dias com o motor frio e em terreno plano. Não espere a luz do painel acender para fazer a troca!";
    }

    @GetMapping("/veiculos")
    public String veiculos(){
        return "Atendemos veículos leves, utilitários, SUVs e sedans das principais marcas do mercado: Chevrolet (Onix, Prisma, Tracker, Spin), Volkswagen (Gol, Polo, Nivus, T-Cross, Virtus), Fiat (Mobi, Argo, Cronos, Toro, Strada), Ford (Ka, Fiesta, EcoSport, Ranger), Hyundai (HB20, Creta), Toyota (Corolla, Yaris, Hilux), Honda (Civic, Fit, HR-V) e Renault (Kwid, Sandero, Duster). Para modelos importados ou veículos a diesel pesados, consulte nossa equipe.";
    }

}
