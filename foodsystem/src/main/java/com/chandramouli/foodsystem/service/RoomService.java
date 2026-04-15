package com.chandramouli.foodsystem.service;

import com.chandramouli.foodsystem.model.Room;
import com.chandramouli.foodsystem.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository repo;

    public RoomService(RoomRepository repo) {
        this.repo = repo;
    }

    public Room addRoom(Room room) {
        return repo.save(room);
    }

    public List<Room> getRooms() {
        return repo.findAll();
    }

    public void deleteRoom(Long id) {
        repo.deleteById(id);
    }

    // ✅ FINAL BOOK ROOM METHOD (SAFE)
    public Room bookRoom(Long id) {
        Room room = repo.findById(id).orElseThrow();

        if (room.isAvailable()) {
            room.setAvailable(false);
            return repo.save(room);
        }

        return room; // already booked
    }
}