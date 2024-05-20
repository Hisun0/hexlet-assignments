@import exercise.dto.posts.PostPage

@param PostPage page

@template.layout.page(
    content = @`
        <div class="container">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${page.getPost().getName()}</h5>
                    <h6 class="card-subtitle mb-2 text-body-secondary">Id: ${page.getPost().getId()}</h6>
                    <p class="card-text">${page.getPost().getBody()}</p>
                    <a href="/posts" class="card-link">Get back to the posts</a>
                </div>
            </div>
        </div>
    `
)