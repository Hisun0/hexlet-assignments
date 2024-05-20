@import exercise.dto.posts.PostsPage

@param PostsPage page

@template.layout.page(
    content = @`
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Body</th>
                    </tr>
                </thead>
                <tbody>
                    @for(var post : page.getPosts())
                        <tr>
                            <th scope="row"><a href="/posts/${post.getId()}">${post.getId()}</a></th>
                            <td>${post.getName()}</td>
                            <td>${post.getBody()}</td>
                        </tr>
                    @endfor
                </tbody>
            </table>

            <nav class="mt-3" aria-label="Page navigation example">
                <ul class="pagination">
                    @for(int i = 1; i <= page.getPosts().size(); i++)
                        <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>
                    @endfor
                </ul>
            </nav>
        </div>
    `
)