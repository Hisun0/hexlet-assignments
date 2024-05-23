@import exercise.dto.posts.PostsPage
@import exercise.util.NamedRoutes
@param PostsPage page

@template.layout.page(
    content = @`
        <div class="container">
            @if(page.getFlash() != null)
                <div class="alert alert-success" role="alert">
                    ${page.getFlash()}
                </div>
            @endif
            
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
                        <th scope="row">
                            <a href="${NamedRoutes.postPath(post.getId())}">${post.getId()}</a>
                        </th>
                        <th>${post.getName()}</th>
                        <th>${post.getBody()}</th>
                    </tr>
                @endfor
                </tbody>
            </table>
        </div>
    `
)
