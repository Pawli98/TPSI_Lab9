/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.lab9;

/**
 *
 * @author pawel
 */
class BlogPost 
{
    Long id;
    String title;
    String content ;
    
    public BlogPost()
    {

    }
    
    public BlogPost(Long id, String title, String content) 
    {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    
    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getContent() 
    {
        return content;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }
}

