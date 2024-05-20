@import exercise.dto.articles.BuildArticlePage

@param BuildArticlePage page

@template.layout.page(
    content = @`
        <div class="p-3">
            @if(page.getErrors() != null)
                <ul>
                    @for(var validator : page.getErrors().values())
                        @for(var error : validator)
                            <li class="text-danger">${error.getMessage()}</li>
                        @endfor
                    @endfor
                </ul>
            @endif

            <form action="/articles" method="post">
                <div class="mb-3">
                    <label for="form-control-1" class="form-label">Title</label>
                    <input type="text" class="form-control" name="title" value="${page.getTitle()}" id="form-control-1">
                </div>
                <div class="mb-3">
                    <label for="form-control-2" class="form-label">Content</label>
                    <textarea class="form-control" name="content" id="form-control-2" rows="3">${page.getContent()}</textarea>
                </div>
                <div class="mb-3">
                    <input type="submit" class="btn btn-primary">
                </div>
            </form>
        </div>
    `
)
