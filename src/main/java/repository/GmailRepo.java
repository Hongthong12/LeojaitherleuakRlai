package repository;

import entity.GmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GmailRepo extends JpaRepository <GmailEntity,Long> {

}
