package com.factoriaf5.telefono_micasa.repositories;

import com.factoriaf5.telefono_micasa.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByUserId( Long userId); // Add this method
}
