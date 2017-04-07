package SpringBoot.SpringBootApplication;


import java.util.Collection;

import SpringBoot.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);

	void save(Bookmark bookmark);

	Bookmark findOne(Long bookmarkId);



	


	

	


}