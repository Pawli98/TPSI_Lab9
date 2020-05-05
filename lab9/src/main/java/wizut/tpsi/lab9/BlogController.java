/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.lab9;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pawel
 */
@Controller
public class BlogController 
{
    
     @Autowired
    private BlogRepository blogRepository;
     
   @RequestMapping("/")
    public String Home(Model model) throws SQLException{
        List<BlogPost> posts;
        posts = blogRepository.getAllPosts();

        model.addAttribute("posts", posts);

        return "index";
    }

    /**
     *
     * @param post
     * @return
     * @throws SQLException
     */
    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException
    {
        blogRepository.createPost(post);
        return "redirect:/";
    }
    
    /**
     *
     * @param post
     * @return
     * @throws SQLException
     */
    @PostMapping("/deletepost")
    public String deletePost(BlogPost post) throws SQLException 
    {
        blogRepository.deletePost(post.getId());
        return "redirect:/";
    }
    

}
