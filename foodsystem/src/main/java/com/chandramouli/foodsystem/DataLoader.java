package com.chandramouli.foodsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chandramouli.foodsystem.model.Menu;
import com.chandramouli.foodsystem.model.Room;
import com.chandramouli.foodsystem.repository.MenuRepository;
import com.chandramouli.foodsystem.repository.RoomRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(MenuRepository menuRepo, RoomRepository roomRepo) {
        return args -> {

            // ================= FOOD =================
            if (menuRepo.count() == 0) {

                Menu m1 = new Menu();
                m1.setItemName("Biryani");
                m1.setPrice(250);
                menuRepo.save(m1);

                Menu m2 = new Menu();
                m2.setItemName("Burger");
                m2.setPrice(220);
                menuRepo.save(m2);

                Menu m3 = new Menu();
                m3.setItemName("Pizza");
                m3.setPrice(200);
                menuRepo.save(m3);

                System.out.println(" Menu Loaded!");
            }

            // ================= ROOMS =================
            // 🔥 FORCE LOAD EVERY TIME (BEST FOR DEVELOPMENT)
            roomRepo.deleteAll();

           Room r1 = new Room();
           r1.setRoomNumber("101");   // ✅ ADD
           r1.setType("Family Room");
           r1.setPrice(3000);
           r1.setAvailable(true);

           Room r2 = new Room();
           r2.setRoomNumber("102");   // ✅ ADD
           r2.setType("Couple Room");
           r2.setPrice(2000);
           r2.setAvailable(true);

           Room r3 = new Room();
           r3.setRoomNumber("103");   // ✅ ADD
           r3.setType("Dormitory");
           r3.setPrice(800);
           r3.setAvailable(true);
            roomRepo.save(r1);
            roomRepo.save(r2);
            roomRepo.save(r3);

            System.out.println("Rooms Loaded!");
        };
    }
}