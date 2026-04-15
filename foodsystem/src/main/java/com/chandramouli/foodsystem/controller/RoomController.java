package com.chandramouli.foodsystem.controller;

import com.chandramouli.foodsystem.model.Room;
import com.chandramouli.foodsystem.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@CrossOrigin   // ✅ allows frontend calls (important)
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    // ✅ ADD ROOM
    @PostMapping
    public Room addRoom(@RequestBody Room room) {
        return service.addRoom(room);
    }

    // ✅ GET ALL ROOMS
    @GetMapping
    public List<Room> getRooms() {
        return service.getRooms();
    }

    // ✅ DELETE ROOM
    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {
        service.deleteRoom(id);
        return "Room Deleted";
    }

    // ✅ BOOK ROOM
    @PutMapping("/book/{id}")
    public Room bookRoom(@PathVariable Long id) {
        return service.bookRoom(id);
    }
}