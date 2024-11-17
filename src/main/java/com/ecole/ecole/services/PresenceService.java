package com.ecole.ecole.services;

import com.ecole.ecole.models.Presence;
import com.ecole.ecole.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresenceService {
    @Autowired
    private PresenceRepository presenceRepository;

    public List<Presence> getAllPresences() {
        return presenceRepository.findAll();
    }

    public Presence getPresenceById(Long id) {
        return presenceRepository.findById(id).orElse(null);
    }

    public Presence savePresence(Presence presence) {
        return presenceRepository.save(presence);
    }

    public void deletePresence(Long id) {
        presenceRepository.deleteById(id);
    }
}